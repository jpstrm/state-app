/**
 * Api Estado
 * Gerenciamento Estados e municípios.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { CityRequest } from './cityRequest';


/**
 * City list Request
 */
export interface CityListRequest { 
    /**
     * List of Cities
     */
    cities?: Array<CityRequest>;
}