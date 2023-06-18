package pl.wszib.pizzamarket.services;

import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket.data.entities.OpinionEntity;
import pl.wszib.pizzamarket.data.repositories.OpinionRepository;
import pl.wszib.pizzamarket.web.mappers.OpinionMapper;
import pl.wszib.pizzamarket.web.models.OpinionModel;

import java.util.List;

@Service
public class OpinionService {
    private final OpinionRepository opinionRepository;

    public OpinionService(OpinionRepository opinionRepository) {
        this.opinionRepository = opinionRepository;
    }

    public void saveOpinion(OpinionModel opinionModel){
        OpinionEntity opinionEntity = OpinionMapper.toEntity(opinionModel);
        opinionRepository.save(opinionEntity);
    }

    public List<OpinionModel> getAllOpinions() {
        return opinionRepository.findAll().stream().map(opinionEntity -> OpinionMapper.toModel(opinionEntity)).toList();
    }
}
