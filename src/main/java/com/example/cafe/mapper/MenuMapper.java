package com.example.cafe.mapper;

import com.example.cafe.dto.Menus;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {
    @Select("select * from \"coffee\"")
    List<Menus> findAll() ;

    @Update("UPDATE \"coffee\" SET type=#{type},  ingredient=#{ingredient} WHERE id =#{id}")
    void updateMenu(Menus menu);

    @Insert("INSERT INTO coffee (type,  ingredient) VALUES (#{type},#{ingredient} )")
    @SelectKey(resultType = int.class, before = false, keyProperty = "id", keyColumn = "id",
            statement = "select currval('coffee_seq')")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
//    @SelectKey(statement="call identity()", keyProperty="id", before=false, resultType=int.class)
    int createMenu (Menus menu);

    @Delete("DELETE FROM \"coffee\" WHERE id = #{id}")
    boolean  deleteMenu (int id);

}