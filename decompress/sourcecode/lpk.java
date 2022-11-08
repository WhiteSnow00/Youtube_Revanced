import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpk extends agzi implements ahax
{
    public static final lpk a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(lpk.class, a = new lpk());
    }
    
    private lpk() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = lpk.c) == null) {
                    synchronized (lpk.class) {
                        if (lpk.c == null) {
                            lpk.c = (ahbe)new agzb((agzi)lpk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lpk.a;
            }
            case 4: {
                return new agza((agzi)lpk.a);
            }
            case 3: {
                return new lpk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
