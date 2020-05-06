package ua.nure.movenko.summaryTask4.services.dictionary;


import ua.nure.movenko.summaryTask4.entities.TitleDictionary;

import java.sql.ResultSet;

public interface TitleDictionaryService {
    /**
     * Checks if the element with  the specified title exists;
     *
     * @param title is either English or Russian version of the course title
     * @return TitleDictionary object which represents both Russian and English versions of course title
     */
    boolean exists(String title);

    /**
     * Method saves new TitleDictionary entity in the system
     *
     * @param entity an object to save
     * @return generated  for saved entity identical code
     */
    int add(TitleDictionary entity);

    /**
     * Method updates  {@code entity} parameters in the system
     *
     * @param entity contains parameters that define which entity and how should be changed by this method
     * @return {@code true} if at least one parameter was updated
     */
    boolean update(TitleDictionary entity);

    /**
     * Returns an object with the specified {@code id} if it exists
     *
     * @param id is  criteria to find the object by*
     * @return {@code TitleDictionary} object or {@code null} if the object with specified {@code id} doesn't exist
     */
    TitleDictionary getById(int id);

    /**
     * Method forms T object from the data represented in {@code resultSet} and returns formed object
     *
     * @param resultSet is table of data representing a database result set, which
     *                  * is usually generated by executing a statement that queries the database.
     * @return {@code T} object formed on the base of {@code resultSet} data
     */
    TitleDictionary extract(ResultSet resultSet);

    /**
     * Checks if the particular title is already defined as title of the course except the  course with
     * {@param courseId}
     *
     * @param title    is either English or Russian version of the course title
     * @param courseId defines course  excluded from revise
     * @return {@code true} if the particular title uses as title of some course except course with defined courseId
     */
    boolean titleAlreadyInUsage(String title, int courseId);
}
