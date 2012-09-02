(ns lst.mail
  (:require [clj-http.client :as client]))

(def api-key (System/getenv "MAILGUN_API_KEY"))
(def mailgun-domain "lst.mailgun.org")
(def api-endpoint (str "https://api.mailgun.net/v2/"
                       mailgun-domain "/messages"))

(defn send-mail [{:keys [to text]}]
  (client/post
    api-endpoint
    {:basic-auth ["api" api-key]
     :form-params
       {:from (str "a@" mailgun-domain)
       :to to
       :subject "your latest lst"
       :text text}}))
