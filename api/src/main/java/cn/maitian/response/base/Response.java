package cn.maitian.response.base;

/**
 * response generic
 *
 * @param <Data> 泛型数据，可以是bean数据也可以是封装的data数据
 * @author geng
 */
public class Response<Data> extends BaseResponse {

    private Data data;

    /**
     *
     */
    public Response() {
    }

    /**
     * @return the data
     */
    public Data getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Data data) {
        this.data = data;
    }
}
