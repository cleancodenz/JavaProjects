/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.annotation;

import java.lang.annotation.Documented;

/**
 *
 * @author johnson
 */
@Documented  // to make it appear in JavaDoc
public @interface ClassPreamble {
 
   String author();
   String date();
   int currentRevision() default 1;
   String lastModified() default "N/A";
   String lastModifiedBy() default "N/A";
   // Note use of array
   String[] reviewers();
}
