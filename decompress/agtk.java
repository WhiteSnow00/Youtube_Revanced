import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtk extends ahcz implements aheo
{
    public static final agtk a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public agth d;
    private agtl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(agtk.class, a = new agtk());
    }
    
    private agtk() {
        this.g = 2;
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = agtk.e) == null) {
                    synchronized (agtk.class) {
                        if (agtk.e == null) {
                            agtk.e = (ahev)new ahcs((ahcz)agtk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agtk.a;
            }
            case 4: {
                return new ahcr((ahcz)agtk.a);
            }
            case 3: {
                return new agtk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtk.a, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003\u1007\u0002\u001c\u1009\u0013\u001e\u1409\u0015", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
