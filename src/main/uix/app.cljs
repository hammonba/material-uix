(ns uix.app
  (:require
   ["@material-ui/core/styles" :as styles]
   [uix.navbar :refer [navbar]]
   [uix.boiling :as boiling]
   [uix.dom.alpha :as uix.dom]
   [uix.core.alpha :as uix :refer [defui]]

   ["react" :as react]
   ["react-dom" :refer (render)]
   ["@material-ui/core/styles" :as styles]
   ))

(def theme (styles/createMuiTheme #js {:background "linear-gradient(45deg, #FE6B8B 30%, #FF8E53 90%)"}))

(defn app []
  [:> styles/ThemeProvider {:theme theme}
   [:div
    [navbar nil nil]
    [boiling/calculator]
    ]])


(defn ^:export main
  []
  (uix.dom/render [app] (.getElementById js/document "app")))
