package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class OrderRequest {
    private User user;
    private LocalDateTime from;
    private String deliveryMethod;
    private Map<String, Integer> orderedProduct = new Map<String, Integer>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Integer get(Object key) {
            return null;
        }

        @Override
        public Integer put(String key, Integer value) {
            return null;
        }

        @Override
        public Integer remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Integer> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Integer> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Integer>> entrySet() {
            return null;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    };

    public OrderRequest(User user, LocalDateTime from, String deliveryMethod, Map<String, Integer> orderedProduct) {
        this.user = user;
        this.from = from;
        this.deliveryMethod = deliveryMethod;
        this.orderedProduct = this.orderedProduct;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public Map<String, Integer> getOrderedProduct() {
        return orderedProduct;
    }
}
