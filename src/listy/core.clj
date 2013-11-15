(ns listy.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring]))

(defroutes routes
  (GET "/" [] "<h2>Hello from Listy</h2>"))

(defn -main []
   (let [port (Integer/parseInt
                (or (System/getenv "PORT") "8080"))]
     (run-jetty #'routes {:port port :join? false})))
