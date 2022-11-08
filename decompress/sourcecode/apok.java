import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apok extends agzi implements ahax
{
    public static final apok a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)apok.class, (agzi)(a = new apok()));
    }
    
    private apok() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apok.b) == null) {
                    synchronized (apok.class) {
                        if (apok.b == null) {
                            apok.b = (ahbe)new agzb((agzi)apok.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apok.a;
            }
            case 4: {
                return new agza((agzi)apok.a);
            }
            case 3: {
                return new apok();
            }
            case 2: {
                return newMessageInfo((MessageLite)apok.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
