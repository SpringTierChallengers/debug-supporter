package spring.tier.challengers.debugsupporter.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import spring.tier.challengers.debugsupporter.common.Status;

// unchecked exception을 위해 RuntimeException을 상속받음
@Getter
@Setter
@AllArgsConstructor
public class BaseException extends RuntimeException {
    private Status status;
}
