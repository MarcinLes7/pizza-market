package pl.wszib.pizzamarket.web.mappers;

import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.web.models.OpinionModel;

public class OpinionMapper {

    public static OpinionEntity toEntity(OpinionModel model){
        OpinionEntity entity = new OpinionEntity();
        entity.setName(model.getName());
        entity.setContent(model.getContent());

        return entity;
    }

    public static OpinionModel toModel(OpinionEntity opinionEntity) {

        OpinionModel model = new OpinionModel();
        model.setContent(opinionEntity.getContent());
        model.setName(opinionEntity.getName());

        return model;
    }
}
