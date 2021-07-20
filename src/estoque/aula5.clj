(ns estoque.aula5)

(def estoque {"Mochila" 10, "Camiseta" 5})

(println estoque)
(println "Temos" (count estoque) "elementos")
(println "As chaves são:" (keys estoque))
(println "Os valores são:" (vals estoque))

(def estoque {:mochila  10
              :camiseta 5})
(println (assoc estoque :cadeira 3))
(println (update estoque :mochila inc))

(defn tira-um
  [valor]
  (println "Tirando um de" valor)
  (- valor 1))

(println estoque)
(println (update estoque :mochila tira-um))
(println (update estoque :mochila #(- % 3)))

(println (dissoc estoque :mochila))

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})
(println pedido)

(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))
(println pedido)
(println (pedido :mochila))
(println (get pedido :mochila))
(println (:mochila pedido))
(println (:quantidade (:mochila pedido)))
(println (update-in pedido [:mochila :quantidade] inc))

(println (-> pedido
             :mochila
             :quantidade))

