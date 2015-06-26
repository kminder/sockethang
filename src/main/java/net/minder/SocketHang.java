/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.minder;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class SocketHang {

  public static final void main( String[] args ) throws IOException {
    ServerSocket acceptor = new ServerSocket( Integer.parseInt( args[0] ) );
    List<Socket> sockets = new LinkedList<Socket>();
    System.out.println( "Listening on " + acceptor.getLocalPort() );
    while( true ) {
      Socket socket = acceptor.accept();
      System.out.println( "Accepted " + socket.getRemoteSocketAddress() );
      sockets.add( socket );
    }
  }

}
