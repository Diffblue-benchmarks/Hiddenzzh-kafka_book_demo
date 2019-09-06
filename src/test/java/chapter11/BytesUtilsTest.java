package chapter11;

import chapter11.BytesUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;

public class BytesUtilsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void bytesToLongInput8OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act and Assert result
    Assert.assertEquals(0L, BytesUtils.bytesToLong(b));
  }

  // Test written by Diffblue Cover.
  @Test
  public void longToBytesInputZeroOutput8() {

    // Act
    final byte[] actual = BytesUtils.longToBytes(0L);

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }
}
