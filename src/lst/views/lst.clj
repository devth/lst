(ns lst.views.lst
  (:require [lst.views.common :as common]
            [lst.mail :as mail])
  (:use [noir.core :only [defpage]]
        [noir.response :only [redirect]]))

(defpage [:post "/lst"] {:keys [from subject stripped-text]}
         ; TODO: parse and send back as a list to sender
         (prn "POST /lst")
         (prn from)
         (prn subject)
         (prn stripped-text)
         (mail/send-mail {:to from :text (str subject \newline stripped-text)})
         (redirect "/lst"))

(defpage "/lst" []
         (common/layout
           [:h1 "List"]))
