(ns ironmanframework.views
  (:require
   [re-frame.core :as re-frame]
   [ironmanframework.subs :as subs]))


(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello Ironman Ting Ting from " @name]]))
