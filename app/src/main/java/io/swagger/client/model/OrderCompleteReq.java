/**
 * Kiosk API
 * 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderCompleteReq  {
  
  @SerializedName("order_id")
  private String orderId = null;
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("store_id")
  private String storeId = null;
  @SerializedName("amount")
  private String amount = null;
  @SerializedName("tax")
  private String tax = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("cash")
  private String cash = null;
  @SerializedName("card")
  private String card = null;
  @SerializedName("points")
  private String points = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * 현금으로 계산한 가격
   **/
  @ApiModelProperty(value = "현금으로 계산한 가격")
  public String getCash() {
    return cash;
  }
  public void setCash(String cash) {
    this.cash = cash;
  }

  /**
   * 카드로 계산한 가격
   **/
  @ApiModelProperty(value = "카드로 계산한 가격")
  public String getCard() {
    return card;
  }
  public void setCard(String card) {
    this.card = card;
  }

  /**
   * 포인트로 계산한 가격
   **/
  @ApiModelProperty(value = "포인트로 계산한 가격")
  public String getPoints() {
    return points;
  }
  public void setPoints(String points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCompleteReq orderCompleteReq = (OrderCompleteReq) o;
    return (orderId == null ? orderCompleteReq.orderId == null : orderId.equals(orderCompleteReq.orderId)) &&
        (userId == null ? orderCompleteReq.userId == null : userId.equals(orderCompleteReq.userId)) &&
        (storeId == null ? orderCompleteReq.storeId == null : storeId.equals(orderCompleteReq.storeId)) &&
        (amount == null ? orderCompleteReq.amount == null : amount.equals(orderCompleteReq.amount)) &&
        (tax == null ? orderCompleteReq.tax == null : tax.equals(orderCompleteReq.tax)) &&
        (price == null ? orderCompleteReq.price == null : price.equals(orderCompleteReq.price)) &&
        (cash == null ? orderCompleteReq.cash == null : cash.equals(orderCompleteReq.cash)) &&
        (card == null ? orderCompleteReq.card == null : card.equals(orderCompleteReq.card)) &&
        (points == null ? orderCompleteReq.points == null : points.equals(orderCompleteReq.points));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (orderId == null ? 0: orderId.hashCode());
    result = 31 * result + (userId == null ? 0: userId.hashCode());
    result = 31 * result + (storeId == null ? 0: storeId.hashCode());
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (tax == null ? 0: tax.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    result = 31 * result + (cash == null ? 0: cash.hashCode());
    result = 31 * result + (card == null ? 0: card.hashCode());
    result = 31 * result + (points == null ? 0: points.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCompleteReq {\n");
    
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  storeId: ").append(storeId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  cash: ").append(cash).append("\n");
    sb.append("  card: ").append(card).append("\n");
    sb.append("  points: ").append(points).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
