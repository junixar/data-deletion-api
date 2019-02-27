package dev.fbd.datadeletion;

public interface DataDeletionService {

    DeletionResult delete(DeletionCollection deletionCollection, EvaluationStrategy evaluationStrategy, Evaluator... customEvaluators);

}
