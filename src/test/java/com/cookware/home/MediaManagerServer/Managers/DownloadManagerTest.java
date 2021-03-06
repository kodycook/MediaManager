package com.cookware.home.MediaManagerServer.Managers;

import com.cookware.home.MediaManagerServer.DataTypes.Config;
import com.cookware.home.MediaManagerServer.DataTypes.MediaInfo;
import com.cookware.home.MediaManagerServer.DataTypes.MediaType;
import junit.framework.TestCase;
import org.apache.log4j.xml.DOMConfigurator;

import java.time.LocalDate;

/**
 * Created by Kody on 7/11/2017.
 */
public class DownloadManagerTest extends TestCase {
    String logPath = "config/log4j.xml";

    public void testDownloadMedia() throws Exception {
        String primewireUrl = "http://www.primewire.ag/watch-1572-James-Bond-Die-Another-Day-online-free";
        MediaInfo mediaInfo = new MediaInfo();
        Config config = new Config();

        DOMConfigurator.configure(logPath);

        mediaInfo.URL = primewireUrl;
        mediaInfo.QUALITY = -1;
        mediaInfo.TYPE = MediaType.MOVIE;
        mediaInfo.RELEASED= LocalDate.now();
        mediaInfo.NAME = "Temp";

        config.tempPath = "test";

//        new DownloadManager(null, config).downloadMedia(mediaInfo);
    }

    public void testFindVideoMeLinkInHtml() throws Exception {

    }

    public void testExtractAllMediaUrls() throws Exception {

    }

    public void testNewDownload() throws Exception {

    }

    public void testBridgeToVideoMe() throws Exception {
        String primewireUrl = "http://www.primewire.ag/tv-10636-Naruto/season-4-episode-18";
        int quality = 0;
        MediaInfo mediaInfo = new MediaInfo();

        DOMConfigurator.configure(logPath);

        mediaInfo.URL =primewireUrl;
        mediaInfo.QUALITY = quality;

//        DownloadManager.DownloadLink downloadLink = new DownloadManager(null, null).bridgeToVideoMe(mediaInfo);

    }

}