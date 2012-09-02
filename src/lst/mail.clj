(ns lst.mail
  (:require [clj-http.client :as client]))

(def api-key (System/getenv "MAILGUN_API_KEY"))

(def mailgun-domain "app7252075.mailgun.org")

(def api-endpoint (str "https://api.mailgun.net/v2/" mailgun-domain "/messages"))

;;; (def api-endpoint (str "https://api:" api-key "@api.mailgun.net/v2/mailgun.net"))

(defn send-mail [{:keys [to text]}]
  (client/post
    api-endpoint
    {:basic-auth ["api" api-key]
     :form-params
       {:from "a@app7252075.mailgun.org"
       :to to
       :subject "your latest lst"
       :text text}}))
