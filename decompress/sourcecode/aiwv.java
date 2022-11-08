import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwv extends agzi implements ahax
{
    public static final aiwv a;
    private static volatile ahbe b;
    private int c;
    private aiuh d;
    private akdz e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aiwv.class, a = new aiwv());
    }
    
    private aiwv() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aiwv.b) == null) {
                    synchronized (aiwv.class) {
                        if (aiwv.b == null) {
                            aiwv.b = (ahbe)new agzb((agzi)aiwv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aiwv.a;
            }
            case 4: {
                return new agza((agzi)aiwv.a);
            }
            case 3: {
                return new aiwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwv.a, "\u0001\u0002\u0000\u0001\uf143\u1824\uec81\u27d5\u0002\u0000\u0000\u0002\uf143\u1824\u1409\u0000\uec81\u27d5\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
