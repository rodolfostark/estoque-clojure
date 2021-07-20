(ns estoque.aula6)

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(defn imprime [[chave valor]]
  (println chave "e" valor))

(println (map imprime pedido))

(defn preco-dos-produtos [[_ valor]]
  (* (:quantidade valor) (:preco valor)))
(println (reduce + (map preco-dos-produtos pedido)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       (map preco-dos-produtos)
       (reduce +)))
(println (total-do-pedido pedido))

(defn preco-dos-produtos [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-dos-produtos)
       (reduce +)))
(println (total-do-pedido pedido))

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             :chaveiro {:quantidade 1}})

(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println (filter gratuito? (vals pedido)))
