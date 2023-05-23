/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericpair;

import java.util.Objects;

/**
 *
 * @author viktor
 */
class Pair <V1, V2> {    
    private final V1 value1;
    private final V2 value2;
    
    Pair(V1 variable1, V2 variable2) {
        value1 = variable1;
        value2 = variable2;
    }

    public V1 getFirst() {
        return value1;
    }

    public V2 getSecond() {
        return value2;
    }     

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.value1);
        hash = 59 * hash + Objects.hashCode(this.value2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<?, ?> other = (Pair<?, ?>) obj;
        if (!Objects.equals(this.value1, other.value1)) {
            return false;
        }
        return Objects.equals(this.value2, other.value2);
    }
        
    public static <V1, V2> Pair<V1, V2> of(V1 variable1, V2 variable2) {
        return new Pair(variable1, variable2);
    }              
}

