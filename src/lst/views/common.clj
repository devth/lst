(ns lst.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]
        [hiccup.element]))

(def title "lst :: the simple list-building tool")

(defpartial layout [& content]
            (html5
              [:head
                [:title title]
                (include-js "http://code.jquery.com/jquery-1.8.1.min.js")
                (include-css "/css/bootstrap.css" "/css/screen.css")]
              [:body

               [:div.navbar.navbar-fixed-top
                 [:div.navbar-inner
                   [:div.container
                     (link-to {:class "brand"} "/" "lst") 
                     ;;; [:div
                     ;;;   " :: the simple list-building tool"]
                    ]]]


    ;;;   <div class="navbar-inner">
    ;;;     <div class="container">
    ;;;       <div class="nav-collapse collapse">
    ;;;         <ul class="nav">
    ;;;           <li class="active"><a href="#">Home</a></li>
    ;;;           <li><a href="#about">About</a></li>
    ;;;           <li><a href="#contact">Contact</a></li>
    ;;;           <li class="dropdown">
    ;;;             <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
    ;;;             <ul class="dropdown-menu">
    ;;;               <li><a href="#">Action</a></li>
    ;;;               <li><a href="#">Another action</a></li>
    ;;;               <li><a href="#">Something else here</a></li>
    ;;;               <li class="divider"></li>
    ;;;               <li class="nav-header">Nav header</li>
    ;;;               <li><a href="#">Separated link</a></li>
    ;;;               <li><a href="#">One more separated link</a></li>
    ;;;             </ul>
    ;;;           </li>
    ;;;         </ul>
    ;;;         <form class="navbar-form pull-right">
    ;;;           <input class="span2" type="text" placeholder="Email">
    ;;;           <input class="span2" type="password" placeholder="Password">
    ;;;           <button type="submit" class="btn">Sign in</button>
    ;;;         </form>
    ;;;       </div><!--/.nav-collapse -->
    ;;;     </div>
    ;;;   </div>
    ;;; </div>

                [:div.container
                  [:div.content
                    content]
                  [:footer
                    [:small "Built by <a href='http://twitter.com/devth'>@devth</a>"]
                    ]]]))

