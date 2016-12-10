AutoItSetOption("WinTitleMatchMode","2")

WinWait($CmdLine[1])
WinActivate($CmdLine[1])
Send($CmdLine[2])
Send("{TAB}")
Send("{ENTER}")