(ns hiccup.bootstrap.page
  (:use hiccup.page))

(defn include-bootstrap
  "Add Bootstrap CSS and JS resources to the page."
  []
  (list
   (include-css "/bootstrap/css/bootstrap.css")
   (include-css "/bootstrap/css/bootstrap-theme.css")
   (include-js  "/bootstrap/js/bootstrap.js")))

(defn use-bootswatch-theme
  "adds an optional bootswatch theme"
  [theme]
  (let [theme-file (format "/bootstrap/css/%s.css" theme)]
    (list
     (include-css theme-file))))

(defn fixed-layout
  "Encase its contents in a fixed layout container."
  [& content]
  [:div.container content])
