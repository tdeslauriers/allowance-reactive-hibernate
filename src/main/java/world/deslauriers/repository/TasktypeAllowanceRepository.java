package world.deslauriers.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;
import reactor.core.publisher.Mono;
import world.deslauriers.domain.Allowance;
import world.deslauriers.domain.Tasktype;
import world.deslauriers.domain.TasktypeAllowance;

@Repository
public interface TasktypeAllowanceRepository extends ReactorCrudRepository<TasktypeAllowance, Long> {

    Mono<TasktypeAllowance> save(TasktypeAllowance tasktypeAllowance);

    Mono<TasktypeAllowance> findByTasktypeAndAllowance(Tasktype tasktype, Allowance allowance);
}
