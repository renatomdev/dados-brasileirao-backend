package com.rmdev.dadosbrasileiraobackendapi.Domain;

import java.util.Optional;

public interface IMainService<T, ID> {
    Iterable<T> getAll();
    Optional<T> getById(ID id);
}
