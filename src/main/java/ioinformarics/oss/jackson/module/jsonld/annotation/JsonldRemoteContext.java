package ioinformarics.oss.jackson.module.jsonld.annotation;


import java.lang.annotation.*;

/**
 * @author Emidio Stani
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@JsonldResource
public @interface JsonldRemoteContext {
    String value();
}