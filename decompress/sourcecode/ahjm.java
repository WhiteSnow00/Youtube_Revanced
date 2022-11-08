import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjm extends agzi implements ahax
{
    public static final ahjm a;
    private static volatile ahbe d;
    public int b;
    public ahjc c;
    
    static {
        agzi.registerDefaultInstance((Class)ahjm.class, (agzi)(a = new ahjm()));
    }
    
    private ahjm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahjm.d) == null) {
                    synchronized (ahjm.class) {
                        if (ahjm.d == null) {
                            ahjm.d = (ahbe)new agzb((agzi)ahjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahjm.a;
            }
            case 4: {
                return new agza((agzi)ahjm.a);
            }
            case 3: {
                return new ahjm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjm.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "b", "c" });
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
