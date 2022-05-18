(ns http-server
  (:require [org.httpkit.server :as hk]
            [ring.middleware.file :as file]))


(defn app [req]
  {:status  404
   :headers {"Content-Type" "text/html"}
   :body    "file not found"}
  )

(let [port 8080]
  (println "starting http-server on port " port)
  (hk/run-server (file/wrap-file app "resources/public") {:port port}))

(comment
  (load-file "src/clj/http_server.clj")
  )
