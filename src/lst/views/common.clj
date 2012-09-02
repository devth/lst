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
                      (link-to {:class "brand"} "/" "lst") ]]]

                [:div.container
                  [:div.content
                    content]

                  [:footer
                    [:small "Built by <a href='http://twitter.com/devth'>@devth</a>"]
                    ]]

                [:div.analytics
                  """
                  <script type='text/javascript'>
                     var _gaq = _gaq || [];
                     _gaq.push(['_setAccount', 'UA-34524955-1']);
                     _gaq.push(['_trackPageview']);
                     (function() {
                       var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
                       ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
                       var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
                     })();
                   </script>
                   """]]))

