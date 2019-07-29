package techcourse.myblog.article.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import techcourse.myblog.article.exception.NotMatchUserException;

@ControllerAdvice("techcourse.myblog.article.controller")
public class ArticleExceptionAdvice {

    @ExceptionHandler(NotMatchUserException.class)
    public RedirectView handleNotMatchUserException(NotMatchUserException e, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
        return new RedirectView("/");
    }
}
