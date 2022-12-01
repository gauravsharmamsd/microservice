package com.test;

 public enum PaymentObjectE
/*    */ {
/*  6 */   ID(100),
/*  7 */   TYPE(101),
/*  8 */   PRIORITY(102),
/*  9 */   BRANCH(103);
/*    */   
/*    */   private int type;
/*    */   
/*    */   PaymentObjectE(int type) {
/* 14 */     this.type = type;
/*    */   }
/*    */   
/*    */   public int getType() {
/* 18 */     return this.type;
/*    */   }
/*    */ }
