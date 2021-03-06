(ns lcmap.client.jobs
  (:require [lcmap.client.http :as http]
            [lcmap.client.lcmap :as lcmap]))

(def context (str lcmap/context "/jobs"))

(defn get-resources [& {keys [] :as args}]
  (http/get (str context "/")
            :lcmap-opts (or args {})))
