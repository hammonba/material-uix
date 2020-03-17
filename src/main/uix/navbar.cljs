(ns uix.navbar
  (:require [shadow.markup.react :as html :refer ($ defstyled)]
            [shadow.dom :as dom]
            ["react" :as react]
            ["react-dom" :refer (render)]
            ["@material-ui/core/AppBar" :as appbar :default default]
            ["@material-ui/core/Toolbar" :as toolbar]
            ["@material-ui/core/Typography" :as typography]))


(defn navbar [st]
  [:div
   [:> appbar/default {:position "static"}
    [:> toolbar/default
     [:> typography/default {:variant "h6" :color "inherit"}
     "Material UIX app"
      ]]]])
