(ns uix.state-hook
  "taken from https://github.com/roman01la/uix/blob/edcada1e7112b6f3fa2eaccdd1de8dcaa9e98ef9/core/dev/uix/recipes/state_hook.cljc"
  (:require [uix.core.alpha :as uix]))

(deftype Cursor [ref path]
  IDeref
  (-deref [o]
    (get-in @ref path))
  IReset
  (-reset! [o new-value]
    (swap! ref update-in path (constantly new-value)))
  ISwap
  (-swap! [o f]
    (-reset! o (f (-deref o))))
  (-swap! [o f a]
    (-reset! o (f (-deref o) a)))
  (-swap! [o f a b]
    (-reset! o (f (-deref o) a b)))
  (-swap! [o f a b xs]
    (-reset! o (apply f (-deref o) a b xs)))
  )


(defn derive-state [ref path]
  (uix/memo #(Cursor. ref path) [ref path]))
