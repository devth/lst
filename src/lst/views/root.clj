(ns lst.views.root
  (:require [lst.views.common :as common])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
         (common/layout
           [:h1 "Start using it right now"]
           [:p "Email <a href='mailto:a@lst.herokuapp.com'>a@lst.herokuapp.com
               </a> to create or update your list."]))



         ;;; (if-let [todo-id (add-todo title due)]
         ;;;   (response/json {:id todo-id
         ;;;                  :title title
         ;;;                  :due-date due})
         ;;;   (response/empty)))

