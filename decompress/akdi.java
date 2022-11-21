import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdi extends ahcz implements aheo
{
    public static final akdi a;
    private static volatile ahev m;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public ajws f;
    public ajws g;
    public ahbt h;
    public ahkb i;
    public float j;
    public akdh k;
    public akdh l;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(akdi.class, a = new akdi());
    }
    
    private akdi() {
        this.c = 0;
        this.o = 2;
        emptyProtobufList();
        this.h = ahbt.b;
    }
    
    public static void a(final akdi akdi) {
        akdi.b |= 0x1;
        akdi.e = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = akdi.m) == null) {
                    synchronized (akdi.class) {
                        if (akdi.m == null) {
                            akdi.m = (ahev)new ahcs((ahcz)akdi.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akdi.a;
            }
            case 4: {
                return new ahcr((ahcz)akdi.a);
            }
            case 3: {
                return new akdi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdi.a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0005\u0001\u1409\u0001\u0002\u1409\u0005\u0003\u100a\u0006\u0004\u1009\u0007\u0005\u1409\u0002\u0006\u1001\b\u0007\u1409\t\b\u1409\n\t\u1007\u0000\u000b\u103f\u0000\f\u103c\u0000\r\u103c\u0000", new Object[] { "d", "c", "b", "f", "n", "h", "i", "g", "j", "k", "l", "e", akan.i, aicx.class, aout.class });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
