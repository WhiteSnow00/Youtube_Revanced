import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqk extends agzi implements ahax
{
    public static final apqk a;
    private static volatile ahbe b;
    private int c;
    private aibb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apqk.class, (agzi)(a = new apqk()));
    }
    
    private apqk() {
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
                final ahbe b2;
                if ((b2 = apqk.b) == null) {
                    synchronized (apqk.class) {
                        if (apqk.b == null) {
                            apqk.b = (ahbe)new agzb((agzi)apqk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apqk.a;
            }
            case 4: {
                return new agza((agzi)apqk.a);
            }
            case 3: {
                return new apqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqk.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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