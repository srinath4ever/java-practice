package com.aaa;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 * @author Srinath Rayabarapu
 */
public class TSMain {

    public List<String> findStringTesco(List<String> inputStringsList, String searchKey) {
        List<String> tesco = inputStringsList.stream().
                filter(str -> str.toLowerCase().contains(searchKey.toLowerCase())).collect(Collectors.toList());
        return tesco;
    }

}
