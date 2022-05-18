(ns http-server
  (:require [org.httpkit.server :as hk]
            [ring.middleware.file :as file]
            [ring.middleware.params :as params]
            [ring.middleware.keyword-params :as kparams]
            [ring.middleware.resource :as r]))


(defn app [req]
  {:status  404
   :headers {"Content-Type" "text/html"}
   :body    "file not found"}
  )

(hk/run-server (file/wrap-file app "resources/public") {:port 8080})

(comment
  (load-file "src/clj/http_server.clj")
  )
