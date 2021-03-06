/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

/**
 * Common utilities related to {@link Record} types and constructing
 * {@link RecordMapper}.
 * <p>
 * The various <code>mapping()</code> methods can be used e.g. to map between
 * {@link Record} types and constructors of known degree, such as in this
 * example:
 * <p>
 * <code><pre>
 * record Actor (int id, String firstName, String lastName) {}
 *
 * List&lt;Actor&gt; actors =
 * ctx.select(ACTOR.ID, ACTOR.FIRST_NAME, ACTOR.LAST_NAME)
 *    .from(ACTOR)
 *    .fetch(mapping(Actor::new));
 * </pre></code>
 *
 * @author Lukas Eder
 */
public final class Records {



    /**
     * Create a {@link RecordMapper} that can map from {@link Record1} to a user type
     * in a type safe way.
     */
    public static final <T1, R extends Record1<T1>, U> RecordMapper<R, U> mapping(
        Function1<? super T1, ? extends U> function
    ) {
        return r -> function.apply(r.value1());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record2} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, R extends Record2<T1, T2>, U> RecordMapper<R, U> mapping(
        Function2<? super T1, ? super T2, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record3} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, R extends Record3<T1, T2, T3>, U> RecordMapper<R, U> mapping(
        Function3<? super T1, ? super T2, ? super T3, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record4} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, R extends Record4<T1, T2, T3, T4>, U> RecordMapper<R, U> mapping(
        Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record5} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, R extends Record5<T1, T2, T3, T4, T5>, U> RecordMapper<R, U> mapping(
        Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record6} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, R extends Record6<T1, T2, T3, T4, T5, T6>, U> RecordMapper<R, U> mapping(
        Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record7} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, R extends Record7<T1, T2, T3, T4, T5, T6, T7>, U> RecordMapper<R, U> mapping(
        Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record8} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, R extends Record8<T1, T2, T3, T4, T5, T6, T7, T8>, U> RecordMapper<R, U> mapping(
        Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record9} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R extends Record9<T1, T2, T3, T4, T5, T6, T7, T8, T9>, U> RecordMapper<R, U> mapping(
        Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record10} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R extends Record10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, U> RecordMapper<R, U> mapping(
        Function10<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record11} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>, U> RecordMapper<R, U> mapping(
        Function11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record12} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R extends Record12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, U> RecordMapper<R, U> mapping(
        Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record13} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R extends Record13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>, U> RecordMapper<R, U> mapping(
        Function13<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record14} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R extends Record14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>, U> RecordMapper<R, U> mapping(
        Function14<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record15} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R extends Record15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>, U> RecordMapper<R, U> mapping(
        Function15<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record16} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R extends Record16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>, U> RecordMapper<R, U> mapping(
        Function16<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record17} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R extends Record17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>, U> RecordMapper<R, U> mapping(
        Function17<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record18} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R extends Record18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>, U> RecordMapper<R, U> mapping(
        Function18<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record19} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R extends Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>, U> RecordMapper<R, U> mapping(
        Function19<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record20} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R extends Record20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>, U> RecordMapper<R, U> mapping(
        Function20<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19(), r.value20());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record21} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R extends Record21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, U> RecordMapper<R, U> mapping(
        Function21<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19(), r.value20(), r.value21());
    }

    /**
     * Create a {@link RecordMapper} that can map from {@link Record22} to a user type
     * in a type safe way.
     */
    public static final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R extends Record22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>, U> RecordMapper<R, U> mapping(
        Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends U> function
    ) {
        return r -> function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19(), r.value20(), r.value21(), r.value22());
    }


}
