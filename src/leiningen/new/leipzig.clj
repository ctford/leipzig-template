(ns leiningen.new.leipzig
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "leipzig"))

(defn leipzig
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' Leipzig project.")
    (->files data
             ["src/{{sanitized}}/song.clj" (render "song.clj" data)]
             ["project.clj" (render "project.clj" data)])))
