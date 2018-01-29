(ns mapping-users.core
  (:gen-class))


(def users ["Theo" "James" "Rick"])

(defn reverseUser [user]
	(apply str (reverse user))
)

(defn -main
	[]
	(println (map reverseUser users))
)
