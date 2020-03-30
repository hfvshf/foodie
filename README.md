# foodie 学习笔记

一、Spring 事务传播<br>
  1、REQUIRED：使用当前的事务，如果当前没有事务则自己新建事务，如果当前存在事务，则加入到这个事务里<br>
  2、SUPPORT：如果当前有事务，则使用事务；如果当前没有则不使用<br>
  3、MANDATORY：该传播强制必须存在一个事务，否则抛出异常<br>
  4、REQUIRES_NEW：如果当前有事务，则挂起事务，并自己创建一个新事务；若果没有同REQUIRED<br>
  5、NEVER：如果当前有事务，抛出异常<br>
  6、NESTED：如果有事务，则开启子事务，子事务嵌套独立提交或回滚<br>
  &nbsp;&nbsp;&nbsp;&nbsp;如果当前没有事务，则同REQUIRED<br>
  &nbsp;&nbsp;&nbsp;&nbsp;如果主事务提交，子事务一起提交<br>
  &nbsp;&nbsp;&nbsp;&nbsp;如果主事务回滚，子事务回滚<br>
