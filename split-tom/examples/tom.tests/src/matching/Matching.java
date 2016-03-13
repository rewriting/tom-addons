/*
 * Copyright (c) 2004-2013, Universite de Lorraine, Inria
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *  - Redistributions of source code must retain the above copyright
 *  notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  - Neither the name of the Inria nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package matching;

import matching.matchingtom.term.types.Term;
import matching.matchingtom.term.types.term.Appl;
import matching.matchingtom.term.types.term.Match;
import matching.matchingtom.term.types.term.Variable;
import matching.matchingtom.term.types.termlist.cons;
import matching.matchingtom.term.types.termlist.nil;

class Matching {
    

  //-------------------------------------------------------

  public void run() {
    Term p1 = Appl.make("f",cons.make(Variable.make("x"),nil.make()));
    Term s1 = Appl.make("f",cons.make(Appl.make("a",nil.make()),nil.make()));

    Term p2 = Appl.make("f",cons.make(Variable.make("x"),cons.make(Appl.make("g",cons.make(Variable.make("y"),nil.make())),nil.make())));
    Term s2 = Appl.make("f",cons.make(Appl.make("a",nil.make()),cons.make(Appl.make("g",cons.make(Appl.make("b",nil.make()),nil.make())),nil.make())));

    Term p3 = Appl.make("f",cons.make(Appl.make("a",nil.make()),cons.make(Appl.make("g",cons.make(Variable.make("y"),nil.make())),nil.make())));
    Term s3 = Appl.make("f",cons.make(Appl.make("b",nil.make()),cons.make(Appl.make("g",cons.make(Appl.make("b",nil.make()),nil.make())),nil.make())));

    System.out.println("running...");
    System.out.println("p1 = " + p1);
    System.out.println("s1 = " + s1);
    System.out.println("match(p1,s1) = " + Match.make(p1,s1));
    System.out.println("p2 = " + p2);
    System.out.println("s2 = " + s2);
    System.out.println("match(p2,s2) = " + Match.make(p2,s2));
    System.out.println("match(p3,s3) = " + Match.make(p3,s3));
  }

  public final static void main(String[] args) {
    Matching test = new Matching();
    test.run();
  }
}
