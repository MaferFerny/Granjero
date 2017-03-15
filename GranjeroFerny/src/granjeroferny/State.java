/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granjeroferny;

import java.util.ArrayList;
import granjeroferny.Transition.Action;

/**
 *
 * @author @author ferny
 */
public class State {

    boolean isFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Position {
        DERECHA, IZQUIERDA
    }
    public Position oveja;
    public Position repollos;
    public Position lobo;
    public Position granjero;

    //metodo para agregar la logica del estado si es valido o no.
    //1er Nivel
    public boolean isValid() {
        if       ((oveja == Position.DERECHA)
                && (repollos == Position.DERECHA)
                && (lobo == Position.DERECHA)
                && (granjero == Position.DERECHA)) {
            return true;
            //2do Nivel
        }
        if      ((oveja == Position.DERECHA)
                && (repollos == Position.IZQUIERDA)
                && (lobo == Position.IZQUIERDA)
                && (granjero == Position.IZQUIERDA)) {
            return true;
        }
//3er Nivel
            if ((oveja == Position.DERECHA)
                    && (repollos == Position.DERECHA)
                    && (lobo == Position.IZQUIERDA)
                    && (granjero == Position.DERECHA)) {
                return false;
            }
                if ((oveja == Position.DERECHA)
                        && (repollos == Position.IZQUIERDA)
                        && (lobo == Position.IZQUIERDA)
                        && (granjero == Position.DERECHA)) {
                    return true;
                }
                    // 4to Nivel
                    if ((oveja == Position.IZQUIERDA)
                            && (repollos == Position.IZQUIERDA)
                            && (lobo == Position.IZQUIERDA)
                            && (granjero == Position.IZQUIERDA)) {
                        return true;
                    }
                        //5to nivel
                        if ((oveja == Position.IZQUIERDA)
                                && (repollos == Position.IZQUIERDA)
                                && (lobo == Position.DERECHA)
                                && (granjero == Position.DERECHA)) {
                            return false;
                        }
                            if ((oveja == Position.DERECHA)
                                    && (repollos == Position.IZQUIERDA)
                                    && (lobo == Position.DERECHA)
                                    && (granjero == Position.DERECHA)) {
                                return true;
                            }
                                if ((oveja == Position.DERECHA)
                                        && (repollos == Position.DERECHA)
                                        && (lobo == Position.IZQUIERDA)
                                        && (granjero == Position.DERECHA)) {
                                    return true;
                                }
                                    if ((oveja == Position.IZQUIERDA)
                                            && (repollos == Position.DERECHA)
                                            && (lobo == Position.IZQUIERDA)
                                            && (granjero == Position.DERECHA)) {
                                        return false;
                                    }
                                        // 6to Nivel
                                        if ((oveja == Position.DERECHA)
                                                && (repollos == Position.IZQUIERDA)
                                                && (lobo == Position.IZQUIERDA)
                                                && (granjero == Position.IZQUIERDA)) {
                                            return true;
                                        }
                                            if ((oveja == Position.DERECHA)
                                                    && (repollos == Position.IZQUIERDA)
                                                    && (lobo == Position.DERECHA)
                                                    && (granjero == Position.IZQUIERDA)) {
                                                return false;
                                            }
                                                if ((oveja == Position.DERECHA)
                                                        && (repollos == Position.IZQUIERDA)
                                                        && (lobo == Position.IZQUIERDA)
                                                        && (granjero == Position.IZQUIERDA)) {
                                                    return true;
                                                }
                                                    if ((oveja == Position.DERECHA)
                                                            && (repollos == Position.DERECHA)
                                                            && (lobo == Position.IZQUIERDA)
                                                            && (granjero == Position.IZQUIERDA)) {
                                                        return false;
                                                    }
                                                        // 7mo Nivel
                                                        if ((oveja == Position.DERECHA)
                                                                && (repollos == Position.IZQUIERDA)
                                                                && (lobo == Position.IZQUIERDA)
                                                                && (granjero == Position.IZQUIERDA)) {
                                                            return true;
                                                        }
                                                            // 8 Nivel
                                                            if ((oveja == Position.DERECHA)
                                                                    && (repollos == Position.DERECHA)
                                                                    && (lobo == Position.IZQUIERDA)
                                                                    && (granjero == Position.DERECHA)) {
                                                                return false;
                                                            }
                                                                if ((oveja == Position.DERECHA)
                                                                        && (repollos == Position.IZQUIERDA)
                                                                        && (lobo == Position.IZQUIERDA)
                                                                        && (granjero == Position.DERECHA)) {
                                                                    return true;
                                                                }
                                                                // 9no Nivel
                                                                // metodo que valida el estado final

                                                                if ((oveja == Position.IZQUIERDA)
                                                                        && (repollos == Position.IZQUIERDA)
                                                                        && (granjero == Position.IZQUIERDA)) {
                                                                    return true;
                                                                }
                                                                return false;

                                                            }
                                                            // declarar
    public ArrayList<Transition> validTransitions() {
        ArrayList<Transition> result
                = new ArrayList<Transition>(0);
        return result;
        //mover al granjero
        /*   result.add(new Transition());*/

    }

}
