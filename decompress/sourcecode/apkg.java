import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkg extends agzi implements ahax
{
    public static final apkg a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apkg.class, a = new apkg());
    }
    
    private apkg() {
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
                if ((c = apkg.c) == null) {
                    synchronized (apkg.class) {
                        if (apkg.c == null) {
                            apkg.c = (ahbe)new agzb((agzi)apkg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apkg.a;
            }
            case 4: {
                return new agza((agzi)apkg.a);
            }
            case 3: {
                return new apkg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apjd.k });
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
