import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidc extends agzi implements ahax
{
    public static final aidc a;
    private static volatile ahbe c;
    public ansi b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidc.class, (agzi)(a = new aidc()));
    }
    
    private aidc() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aidc.c) == null) {
                    synchronized (aidc.class) {
                        if (aidc.c == null) {
                            aidc.c = (ahbe)new agzb((agzi)aidc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aidc.a;
            }
            case 4: {
                return new agza((agzi)aidc.a);
            }
            case 3: {
                return new aidc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidc.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
