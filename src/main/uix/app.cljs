(ns uix.app
  (:require [uix.navbar :refer [navbar]]
            [uix.dom.alpha :as uix.dom]
            [uix.core.alpha :as uix]))

(defn app [st]
  [:div
   [navbar st]
   "this is for content"
   ])

(defn ^:export main
  []
  (uix.dom/render [app] (.getElementById js/document "app")))
