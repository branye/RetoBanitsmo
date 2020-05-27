/**
 * @since 25/04/2018

 */
package co.com.sophos.certification.challenge.util.datamanagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Se crea una anotación personalizada porque necesitamos copiar todos los datos
 * del archivo de Excel al archivo .feature antes de comenzar a ejecutar
 *
 * @since 25/04/2018
 * @author carmarlo
 *
 */
// @Retention(RUNTIME)
// @Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeSuite {

}
